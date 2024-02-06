package traFinal;

import java.util.ArrayList;

public class CajeroAutomatico {
    private static ArrayList<Cliente> clientes;
    
    public CajeroAutomatico() {
        setClientes(new ArrayList<>());
        // lista de clientes
        getClientes().add(new Cliente("12345678", "Ivan Barboza", "123456"));
        getClientes().add(new Cliente("21345678", "Angela Vegas", "213456"));
        getClientes().add(new Cliente("31245678", "Lady Perez", "312456"));
        getClientes().add(new Cliente("41235678", "Diana Simon", "412356"));
        getClientes().add(new Cliente("51234678", "Alexandra Ayerve", "512346"));
    }

    public Cliente buscarClientePorDNI(String dni) {
        for (Cliente cliente : getClientes()) {
            if (cliente.getDni().equals(dni)) {
                return cliente; // 
            }
        }
        return null; // CLIENTE NO ENCONTRADO 
    }
    
	public static void setText(String string) {
		// TODO Auto-generated method stub
		
	}

	public void realizarDeposito(String dni, double cantidadDeposito) {
		// TODO Auto-generated method stub	
	}

	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
}