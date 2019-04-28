package com.enjoy.spring6.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @auther xuxq
 * @date 2019/4/28 19:34
 */
public class BobImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.enjoy.spring6.bean.Fish","com.enjoy.spring6.bean.Tiger"};
    }
}
