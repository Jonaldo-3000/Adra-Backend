package py.adra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Rol_Privilegios {
	private int id_rol_privilegios;
	private int rol_id;
	private int privilegios_id;
}
