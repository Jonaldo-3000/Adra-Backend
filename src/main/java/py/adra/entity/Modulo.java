package py.adra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Modulo {
	private int id_modulo;
	private String nombre;
	private int categoria_id;
}
