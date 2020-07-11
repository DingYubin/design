package hybrid.service;

import hybrid.dto.input.CommonInput;
import hybrid.dto.output.AssetNoticeOutput;

public interface Product<T extends CommonInput> {
    AssetNoticeOutput invoke(T input);
}
