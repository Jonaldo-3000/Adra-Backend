package py.adra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Recurso {
	private int id_sesion;
	private String nombre;
	private String descripcion;
	private int sesion_id;
	private int tipo_id;
}
