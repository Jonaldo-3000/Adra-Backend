package py.adra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Programacion {
	private int id_programacion;
	private int estado;
	private int bancocomunal_id;
	private int modulo_id;
}
