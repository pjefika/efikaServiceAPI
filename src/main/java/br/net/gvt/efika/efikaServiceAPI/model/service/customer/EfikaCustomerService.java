/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.efikaServiceAPI.model.service.customer;

import br.net.gvt.efika.efika_customer.model.customer.EfikaCustomer;

/**
 * Consultar Inventário de Serviços (CRM), Consultar Inventário de Rede
 * (Interna/Externa);
 *
 * @author G0042204
 */
public interface EfikaCustomerService {

    public EfikaCustomer consultar(String instancia) throws Exception;

}
