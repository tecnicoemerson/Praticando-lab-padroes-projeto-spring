package emerson.lab_padroes_projeto_spring.service;

import emerson.lab_padroes_projeto_spring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
 * <b>ViaCEP</b>.
 *
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 */


/**
 * A interface ViaCepService é um cliente HTTP criado através da biblioteca
 * OpenFeign, para consumir a API do ViaCEP. A URL da API é definida no annotation
 * @FeignClient.
 *
 * O método consultarCep consome a API do ViaCEP, passando o CEP como parâmetro
 * na URL, e retorna um objeto do tipo Endereco, que representa o endereço
 * correspondente ao CEP fornecido.
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    /**
     * Método para consultar um endereço através do CEP.
     *
     * @param  cep  o CEP do endereço a ser consultado
     * @return      o objeto Endereco correspondente ao CEP fornecido
     */
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
