package hedx.example.mysiteserver.domain.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;


@Data
public class RoleDeleteDTO {
    @NotNull
    private List<Long> Ids;
}
