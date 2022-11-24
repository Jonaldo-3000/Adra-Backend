package py.adra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
	private int id_persona;
	private String apellido_pat;
	private String apellido_mat;
	private char dni;
	private String correo;
	private char telefono;
}
