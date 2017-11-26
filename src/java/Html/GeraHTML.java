package Html;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import modelo.Usuario;

/**
 *
 * @author Lenovo
 */
public class GeraHTML {

    public String getListUsuario(List lista) {
        StringBuffer sb = new StringBuffer();
        for (Iterator it = lista.iterator(); it.hasNext();) {
            String strDate;
            String tipoUsu;
            Usuario u = (Usuario) it.next();
            strDate = "Null Value";
            if (u.getData_nascimento() != null) {
                strDate = new SimpleDateFormat("dd/MM/yyyy").format(u.getData_nascimento());
            }
            if(u.getTipo().equals("A")){
                tipoUsu = "Administrador";
            }else{
                tipoUsu = "Cliente"; 
            }
            sb.append("<li>"
                    + "<span class='booking-item'>"
                    + "<div class='row'>"
                    + "<div class='col-md-3'>"
                    + " <div class='booking-item-car-img'>"
                    + "<h4>Nome:"+ u.getNome() +"</h4>"
                    + "<p class='booking-item-car-title'>Tipo:" + tipoUsu + "</p>"
                    + "</div>"
                    + "</div>"
                    + "<div class='col-md-6'>"
                    + "<div clas='row'>"
                    + "<div class='col-md8'>"
                    + "<p class='booking-item-car-title'>Data Nascimento: '" + strDate + "'</p><br>"
                    + "<p class=\"booking-item-car-title\">Telefone:'" + u.getTelefone() + "'</p>"
                    + "</div></div></div>"
                    + "<div class='col-md-3'><br>"
                    + "<a href='formAtualizarUsuario.jsp?id_usuario="+u.getId_usuario()+"' class='btn btn-primary'>Editar</a>"
                          
                    + "</div></div></span</li>");
        }
        return sb.toString();
    }

    public String getFormAtualizarUsuario(Usuario u) {
        StringBuffer sb = new StringBuffer();

        String strDate = "Null Value";
        if (u.getData_nascimento() != null) {
            strDate = new SimpleDateFormat("dd/MM/yyyy").format(u.getData_nascimento());
        }
        sb.append("<form action='atualizarConta.jsp' name='atualizarConta' method='post'>\n");
        sb.append("\t\t<h4>Informações de Usuário</h4>"
                + "<div class='form-group'>"
                 + "<label>Nome Completo</label>"
                + "<input class='form-control' value='" + u.getNome() + "' type='text' name='nome' />"
                + "</div>"
                + "<div class='form-group'>"
                + "<label>E-mail</label>"
                + "<input class='form-control' value='" + u.getEmail() + "' name='email' type='text' />"
                + "</div>"
                + "<div class='form-group'>"
                + "<label>Telefone</label>"
                + "<input class='form-control' value='" + u.getTelefone() + "' name='telefone' type='text'/>"
                + "</div>"
                + "<div class='form-group'>"
                + "<lavel>CPF</label>"
                + "<input class='form-control' value='" + u.getCpf() + "' type='text'/>"
                + "</div>"
                + "<div class='form-group'>"
                + "<label>Data Nascimento</label>"
                + "<input class='form-control' value='" + u.getData_nascimento() + "' type='date'/>"
                + "</div>"
                + "<div class='form-group'>"
                + "<label>Senha</label>"
                + "<input class='form-control value='' type='password' name='senha'/>"
                + "<div>"
                + "<input disable value='C' type='hidden'/>"
                + "<hr>"
                + "<input type='submit' class='btn btn-primary' value='Salvar'>");
        sb.append("\t</form>\r\n");
        return sb.toString();
    }
}
