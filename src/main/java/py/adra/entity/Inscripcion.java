package py.adra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Inscripcion {
	private int id_inscripcion;
	private int estado;
	private int socio_id;
	private int modulo_id;
}
