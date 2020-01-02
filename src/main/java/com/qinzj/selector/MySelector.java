package com.qinzj.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @import方式注入bean的选择器，即选择性的加载bean
 * @author PVer
 *
 */
public class MySelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		
		String[] beans = new String[] {"com.qinzj.entity.A","com.qinzj.entity.B"};
		
		return beans; //返回值是要加入IoC容器的类的全限定名
	}

}
