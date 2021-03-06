package xyz.sally.core.po;

import com.alibaba.fastjson.JSONArray;
import lombok.Builder;
import lombok.Data;

/**
 * @author daitechang
 * @create: 2019-11-15
 **/
@Data
public class InputMeta {
    public String uuid;
    public String drl;
    /**
     * 输入变量
     */
    public JSONArray var;
}
