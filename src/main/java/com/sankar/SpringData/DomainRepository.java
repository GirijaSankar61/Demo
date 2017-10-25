/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sankar.SpringData;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author girija
 */
public interface DomainRepository extends CrudRepository<Domain, Long> {

    List<Domain> findByDomain(String domain);
}
