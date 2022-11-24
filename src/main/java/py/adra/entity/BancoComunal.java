package py.adra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BancoComunal {
	private int id_bancocomunal;
	private String nombre;
	private int asesor_id;
	private int socio_id;
	private int distrito_id;
}
