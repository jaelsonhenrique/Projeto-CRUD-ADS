package usuario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class UsuarioTableModel extends AbstractTableModel {

    private List<Usuario> usuarios = new ArrayList<>();
    private String[] colunas = {"Id"};

    public UsuarioTableModel(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = usuarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return usuario.getId();
        }
        return null;
    }

    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];

        }
        return null;
    }

}
