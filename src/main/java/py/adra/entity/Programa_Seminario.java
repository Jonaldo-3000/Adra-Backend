package py.adra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Programa_Seminario {
	private int id_programa_seminario;
	private int bancocomunal_id;
	private int seminario_id;
}
