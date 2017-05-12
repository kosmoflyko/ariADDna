package com.stnetix.ariaddna.persistence.services;


import com.stnetix.ariaddna.commonutils.DTO.KeyStorePasswordDTO;

import java.util.List;

/**
 * Created by alexkotov on 26.04.17.
 */
public interface IKeyStorePasswordService {

    KeyStorePasswordDTO save(KeyStorePasswordDTO password);

    KeyStorePasswordDTO getPassword();
}
