package xyz.sally.engine.dmo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author daitechang
 * @create: 2019-11-05
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rule {
    /**
     * 前端输入
     */
    private String input;
    /**
     * 主建id
     */
    private Integer id;
    /**
     * drl
     */
    private String drl;
}
