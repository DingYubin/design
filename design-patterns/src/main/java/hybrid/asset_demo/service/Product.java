package hybrid.asset_demo.service;

import hybrid.asset_demo.dto.input.CommonInput;
import hybrid.asset_demo.dto.output.AssetNoticeOutput;

public interface Product<T extends CommonInput> {
    AssetNoticeOutput invoke(T input);
}
