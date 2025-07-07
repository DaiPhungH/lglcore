package com.language.service.security;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

public interface KeyPairProvider {
    RSAPublicKey getRsaPublicKey();

    RSAPrivateKey getRsaPrivateKey();
}
