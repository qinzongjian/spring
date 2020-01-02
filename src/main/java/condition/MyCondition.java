package condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 条件式注解
 * 通过条件式注解，可以根据条件加载bean
 * 需要实现Condition接口，并且在bean的配置处配置@Conditional(MyCondition.class)
 * @author PVer
 *
 */
public class MyCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return false;
	}

}
