package com.saintdan.framework.param;

import com.saintdan.framework.annotation.NotNullField;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpMethod;

/**
 * Param bean for {@link com.saintdan.framework.domain.RoleDomain}
 *
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 10/16/15
 * @since JDK1.8
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleParam extends BaseParam {

    private static final long serialVersionUID = 5027600216405994820L;

    @ApiModelProperty(hidden = true)
    private Long id;

    @NotNullField(method = HttpMethod.POST, message = "name cannot be null.")
    private String name; // role's name
    private String description;
    private String resourceIds; // group ids string
}
