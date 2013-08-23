package net.rainmore.web.utils;

public class ViewHelpers {

    private static String defaultViewPath = "pages";
    private static String defaultTemplatePath = "templates";
    private static String defaultTemplate = "default";

    public static String buildViewPath(String viewPage) {
        return String.format("%s/%s", defaultViewPath, viewPage);
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
