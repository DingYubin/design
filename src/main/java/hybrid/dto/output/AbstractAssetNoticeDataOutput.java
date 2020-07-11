package hybrid.dto.output;

/**
 * 回调资金方通用业务数据
 * 入参不仅仅是通用数据，需创建子类，service中使用子类来组装数据
 * 如
 *  ：合同号申请，需要创建子类添加合同号
 *  ：申请放款，需要添加借据信息
 *  ：申请签章，需要添加合同文件信息
 * Created by LIUBINGJIAN244 on 2019/1/28.
 */
public abstract class AbstractAssetNoticeDataOutput {
    /**
     * Y    申请流水号
     */
    private String applyNo;

    /**
     * Y    业务流水号
     */
    private String businessNo;

    /**
     * Y    用信审批受理流水号
     */
    private String dealNo;

    /**
     * Y    处理结果    1、P： PASS 通过；2、N： NOT-PASS 不通过
     */
    private String dealStatus;

    /**
     * N    描述  不通过必输
     */
    private String dealDesc;

    /**
     * 资产方编码
     */
    private String assetNo;

    /**
     * 产品编码
     */
    private String productNo;

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getDealNo() {
        return dealNo;
    }

    public void setDealNo(String dealNo) {
        this.dealNo = dealNo;
    }

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    public String getDealDesc() {
        return dealDesc;
    }

    public void setDealDesc(String dealDesc) {
        this.dealDesc = dealDesc;
    }

    public String getAssetNo() {
        return assetNo;
    }

    public void setAssetNo(String assetNo) {
        this.assetNo = assetNo;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }
}
