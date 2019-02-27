#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.content.Context;
import android.view.View;
import org.json.JSONObject;

#parse("File Header.java")
public class ${NAME} implements SyrBaseModule, SyrComponent {

    @Override
    public View render(JSONObject component, Context context, View instance) {
        return null;
    }

    @Override
    public String getName() {
        return #if (${JS_SYR_COMPONENT} && ${JS_SYR_COMPONENT} != "") "${JS_SYR_COMPONENT}";#else null;#end
    }
}
