package hybrid.asset_demo.dto.input;

import com.alibaba.fastjson.JSONObject;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

/**
 * @author EX-HEXUDONG001
 */

public class CommonInput implements Serializable {
    private static final long serialVersionUID = -2727758892904451793L;
    /**
     * 资产端平台ID
     * 是否必输：是
     */
    @NotNull
    private String platformId;

    /**
     * 回调url，异步流程需要填写该字段
     * 是否必输：是
     */
//    @NotNull
    private String callbackUrl;

    /**
     * 申请流水号
     * 是否必输：是
     */
    @NotNull
    private String applyNo;

    /**
     * 业务员流水号
     * 是否必输：是
     */
    @NotNull
    private String businessNo;

    /**
     * 受理流水号
     * 是否必输：是
     */
    @NotNull
    private String dealNo;

    /**
     * 接口编号
     */
    @NotNull
    private String callbackInterfaceId;

    /**只转发*/
    private String interfaceId;

    /**
     * 资产方编码
     */
    private String assetNo;

    /**
     * 产品编码
     */
    private String productNo;

    /**
     *
     * 传递参数,不做其他用
     */
    private String remark;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
