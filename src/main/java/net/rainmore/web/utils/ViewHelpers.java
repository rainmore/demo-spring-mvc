package net.rainmore.web.utils;

public class ViewHelpers {

    private static String defaultViewPath = "pages";
    private static String defaultTemplatePath = "templates";
    private static String defaultTemplate = "default";

    public static String buildViewPath(String viewPage, String viewPath) {
        return String.format("%s/%s/%s", defaultViewPath, viewPath, viewPage);
    }

    public static String buildTemplatePath(String template) {
        return String.format("%s/%s", defaultTemplatePath, template);
    }

    public static String getTemplatePath() {
        return buildTemplatePath(defaultTemplate);
    }

    public static String redirect(String url) {
        return String.format("redirect:%s", url);
    }
}
