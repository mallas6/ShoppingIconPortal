/**-------------------------------------+----------------------------------------------------------
 * ApplicationServletInitializer.java
 * Description:  Base class for ApplicationServletInitializer
 * History:
 *
 * Change History:
 * Revision     Date        Dev         Comments
 * ------------------------------------------------------------------------------------------------
 *  1.0        09-13-2019  nagard5      Initial version
 * 
 * Copyright (c) 2009 - 2012. EMC Corporation. All Rights Reserved.
 * This software contains the intellectual property of EMC Corporation or is licensed to
 * EMC Corporation from third parties. Use of this software and the intellectual property
 * contained therein is expressly limited to the terms and conditions of the License
 * Agreement under which it is provided by or on behalf of EMC.
 **************************************************************************************************/
package com.ust.shopping;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

/**
 * Base class for application context initializer.
 */
/**
 * 
 * @author Suneetha
 *
 */
@Configuration
public class ApplicationServletInitializer extends SpringBootServletInitializer {

    /**
     * main method to initialize application.
     * @param application the application.
     * @return SpringApplicationBuilder.
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        SpringApplicationBuilder sources = application.sources(Application.class);
        return sources;
    }

}
