package py.adra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Rol_Usuario {
	private int id_rol_usuario;
	private int rol_id;
	private int usuario_id;
}
