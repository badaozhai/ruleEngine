package xyz.sally.engineapi.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author daitechang
 * @create: 2019-11-05
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExecuteRequest {
    @NotBlank
    private String var;

}
