/**-------------------------------------+----------------------------------------------------------
 * Application.java
 * Description:  Base class for running application
 * History:
 *
 * Change History:
 * Revision     Date        Dev         Comments
 * ------------------------------------------------------------------------------------------------
 * 1.0        09-13-2019  nagard5      Initial version
 * 
 * Copyright (c) 2009 - 2012. EMC Corporation. All Rights Reserved.
 * This software contains the intellectual property of EMC Corporation or is licensed to
 * EMC Corporation from third parties. Use of this software and the intellectual property
 * contained therein is expressly limited to the terms and conditions of the License
 * Agreement under which it is provided by or on behalf of EMC.
 **************************************************************************************************/

package com.ust.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * 
 * @author Suneetha
 *
 */
/**
 * The Class Application.
 */
@Configuration
@ComponentScan(basePackages = { "com.ust" })
@EnableAutoConfiguration
@EnableSwagger2
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
