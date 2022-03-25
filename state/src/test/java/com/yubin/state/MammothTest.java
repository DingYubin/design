package com.yubin.state;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MammothTest {

    private InMemoryAppender appender;

    @BeforeEach
    void setUp() {
        appender = new InMemoryAppender();
    }

    @AfterEach
    void tearDown() {
        appender.stop();
    }

    /**
     * 切换到一个完整的“情绪”循环并验证观察到的情绪是否与预期值匹配
     */
    @Test
    void testTimePasses() {
        final var mammoth = new Mammoth();

        mammoth.observe();
        assertEquals("猛犸象 平静祥和", appender.getLastMessage());
        assertEquals(1, appender.getLogSize());

        mammoth.timePasses();
        assertEquals("猛犸象 生气了!", appender.getLastMessage());
        assertEquals(2, appender.getLogSize());

        mammoth.observe();
        assertEquals("猛犸象 愤怒!", appender.getLastMessage());
        assertEquals(3, appender.getLogSize());

        mammoth.timePasses();
        assertEquals("猛犸象 冷静下来", appender.getLastMessage());
        assertEquals(4, appender.getLogSize());

        mammoth.observe();
        assertEquals("猛犸象 平静祥和", appender.getLastMessage());
        assertEquals(5, appender.getLogSize());
    }

    /**
     * 验证{@link Mammoth#toString()} 是否给出预期值
     */
    @Test
    void testToString() {
        final var toString = new Mammoth().toString();
        assertNotNull(toString);
        assertEquals("猛犸象", toString);
    }

    private class InMemoryAppender extends AppenderBase<ILoggingEvent> {
        private final List<ILoggingEvent> log = new LinkedList<>();

        public InMemoryAppender() {
            ((Logger) LoggerFactory.getLogger("root")).addAppender(this);
            start();
        }

        @Override
        protected void append(ILoggingEvent eventObject) {
            log.add(eventObject);
        }

        public int getLogSize() {
            return log.size();
        }

        public String getLastMessage() {
            return log.get(log.size() - 1).getFormattedMessage();
        }
    }
}