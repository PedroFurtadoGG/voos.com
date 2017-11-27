package Html;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import modelo.Usuario;
import modelo.Avioes;
import modelo.Cidades;

/**
 *
 * @author Lenovo
 */
public class GeraHTML {
    
    //LISTAGEM DE USUARIOS
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
                    + "<p class='booking-item-car-title'>Data Nascimento: " + strDate + "</p><br>"
                    + "<p class='booking-item-car-title'>Telefone:" + u.getTelefone() + "</p>"
                    + "</div></div></div>"
                    + "<div class='col-md-3'><br>"
                    + "<a href='formAtualizarUsuario.jsp?id_usuario="+u.getId_usuario()+"' class='btn btn-primary'>Editar</a>"
                          
                    + "</div></div></span</li>");
        }
        return sb.toString();
    }
    
    //INTERNA DE USUARIO
    public String getFormAtualizarUsuario(Usuario u) {
        StringBuffer sb = new StringBuffer();

        String strDate = "Null Value";
        if (u.getData_nascimento() != null) {
            strDate = new SimpleDateFormat("dd/MM/yyyy").format(u.getData_nascimento());
        }
        sb.append("<form action='atualizarUsuario.jsp' name='atualizarConta' method='post'>\n");
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
    
    public String getListAviao(List lista){
        StringBuffer sb = new StringBuffer();
        for (Iterator it = lista.iterator(); it.hasNext();) {
           
            Avioes a = (Avioes) it.next();
           
            sb.append("<li>"
                    + "<span class='booking-item'>"
                    + "<div class='row'>"
                    + "<div class='col-md-3'>"
                    + " <div class='booking-item-car-img'>"
                    + "<h4>Modelo:"+ a.getModelo()+"</h4>"
                    + "<p class='booking-item-car-title'>Quantidade poltronas:" + a.getQtde_poltronas() + "</p>"
                    + "</div>"
                    + "</div>"
                    + "<div class='col-md-6'>"
                    + "<div clas='row'>"
                    + "<div class='col-md8'>"
                    + "</div></div></div>"
                    + "<div class='col-md-3'><br>"
                    + "<a href='formAtualizarAviao.jsp?id_aviao="+a.getId_aviao()+"' class='btn btn-primary'>Editar</a>"
                    + "<a href='actions/excluirAviao.jsp?id_aviao="+a.getId_aviao()+"' class='btn btn-primary'>Excluir</a>" 
                    + "</div></div></span</li>");
        }
        return sb.toString();
    }
    
    public String getFormAtualizarAviao(Avioes a) {
        StringBuffer sb = new StringBuffer();

       
        sb.append("<form action='atualizarAviao.jsp' name='atualizarConta' method='post'>\n");
        sb.append("\t\t<h4>Informações do Avião</h4>"
                + "<div class='form-group'>"
                 + "<label>Modelo</label>"
                + "<input class='form-control' value='" + a.getModelo()+ "' type='text' name='modelo' />"
                + "</div>"
                + "<div class='form-group'>"
                + "<label>Quantidade de Poltronas</label>"
                + "<input class='form-control' value='" + a.getQtde_poltronas()+ "' name='email' type='text' />"
                + "</div>"
                + "<hr>"
                + "<input type='submit' class='btn btn-primary' value='Salvar'>");
        sb.append("\t</form>\r\n");
        return sb.toString();
    }
    
    public String getListCidade(List lista){
        StringBuffer sb = new StringBuffer();
        for (Iterator it = lista.iterator(); it.hasNext();) {
           
            Cidades c = (Cidades) it.next();
           
            sb.append("<li>"
                    + "<span class='booking-item'>"
                    + "<div class='row'>"
                    + "<div class='col-md-3'>"
                    + " <div class='booking-item-car-img'>"
                    + "<h4>Cidade:"+ c.getNome()+"</h4>"
                    + "<p class='booking-item-car-title'>Quantidade poltronas:" + c.getUf()+ "</p>"
                    + "</div>"
                    + "</div>"
                    + "<div class='col-md-6'>"
                    + "<div clas='row'>"
                    + "<div class='col-md8'>"
                    + "</div></div></div>"
                    + "<div class='col-md-3'><br>"
                    + "<a href='formAtualizarCidade.jsp?id_cidade="+c.getId_cidade()+"' class='btn btn-primary'>Editar</a>"    
                    + "</div></div></span</li>");
        }
        return sb.toString();
    }
    
    public String getFormAtualizarCidade(Cidades c) {
        StringBuffer sb = new StringBuffer();
       
        sb.append("<form action='atualizarCidade.jsp' name='atualizarCidade' method='post'>\n");
        sb.append("\t\t<h4>Informações da Cidade</h4>"
                + "<div class='form-group'>"
                 + "<label>Nome</label>"
                + "<input class='form-control' value='" + c.getNome()+ "' type='text' name='nome' />"
                + "</div>"
                + "<div class='form-group'>"
                + "<label>UF</label>"
                + "<select name='uf' class='form-group'><option value='AC'>Acre</option><option value='AL'>Alagoas</option><option value='AP'>Amapá</option><option value='AM'>Amazonas</option><option value='BA'>Bahia</option><option value='CE'>Ceará</option><option value='DF'>Distrito Federal</option><option value='ES'>Espírito Santo</option><option value='GO'>Goiás</option><option value='MA'>Maranhão</option><option value='MT'>Mato Grosso</option><option value='MS'>Mato Grosso do Sul</option><option value='MG'>Minas Gerais</option><option value='PA'>Pará</option><option value='PB'>Paraíba</option><option value='PR'>Paraná</option><option value='PE'>Pernambuco</option><option value='PI'>Piauí</option><option value='RJ'>Rio de Janeiro</option><option value='RN'>Rio Grande do Norte</option><option value='RS'>Rio Grande do Sul</option><option value='RO'>Rondônia</option><option value='RR'>Roraima</option><option value='SC'>Santa Catarina</option><option value='SP'>São Paulo</option><option value='SE'>Sergipe</option><option value='TO'>Tocantins</option></select>"
                + "</div>"
                + "<hr>"
                + "<input type='submit' class='btn btn-primary' value='Salvar'>");
        sb.append("\t</form>\r\n");
        return sb.toString();
    }
}
