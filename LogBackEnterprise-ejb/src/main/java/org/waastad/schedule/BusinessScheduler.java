/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.schedule;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Helge Waastad <helge.waastad@waastad.org>
 */
@Singleton
public class BusinessScheduler {

    Logger log = LoggerFactory.getLogger(BusinessScheduler.class);

    @Schedule(hour = "*", minute = "*", second = "*/5")
    public void log() {
        log.debug("Logging debug");
        log.info("Logging info");
        log.warn("Logging warn");
        log.error("Logging error");
    }
}
