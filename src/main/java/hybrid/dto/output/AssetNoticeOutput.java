package hybrid.dto.output;

import com.alibaba.fastjson.JSONObject;
import hybrid.dto.input.CommonInput;

/**
 * 回调资金方数据
 * Created by LIUBINGJIAN244 on 2019/1/28.
 */
public class AssetNoticeOutput<T extends AbstractAssetNoticeDataOutput> {
    /**
     * 平台ID
     */
    private String platformId;
    /**
     * 接口编号
     */
    private String interfaceId;
    /**
     * 业务数据
     */
    private T bizContent;

    public AssetNoticeOutput(){}

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

    /**
     * 资金方回调通知数据
     *
     * @param input
     * @param type
     * @return
     */
    public static <T extends AbstractAssetNoticeDataOutput> AssetNoticeOutput<T> newInstance(CommonInput input, Class<T> type) {
            AssetNoticeOutput<T> anOutput = new AssetNoticeOutput<T>();

            return anOutput;

    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }

    public T getBizContent() {
        return bizContent;
    }

    public void setBizContent(T bizContent) {
        this.bizContent = bizContent;
    }
}
