package com.example.accesskeybackend.template.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
@Log4j2
public class CheckApiV6SupportService {

    public boolean supportIpV6(String siteUrl) {
        try {
            InetAddress[] inetAddresses = InetAddress.getAllByName(siteUrl);

            for (InetAddress inetAddress : inetAddresses) {
                if (inetAddress instanceof Inet6Address) {
                    return true;
                }
            }

            return false;

        } catch (UnknownHostException e) {
            return false;
        }
    }
}
