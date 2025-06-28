package hedx.example.mysiteserver.domain.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;


@Data
public class LogDeleteDTO {
    @NotNull
    List<Long> Ids;
}
