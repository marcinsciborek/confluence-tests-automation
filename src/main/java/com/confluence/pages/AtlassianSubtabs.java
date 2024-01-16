package com.confluence.pages;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum AtlassianSubtabs {
    ACCOUNT_SETTINGS("Account settings"),
    ATLASSIAN_SUPPORT("Atlassian Support"),
    ATLASSIAN_COMMUNITY("Atlassian Community"),
    SELF_MANAGED_LICENSING("Self managed licensing"),
    ATLASSIAN_DOCUMENTATION("Atlassian Documentation"),
    TRY_ATLASSIAN_PRODUCTS("Try Atlassian products"),
    ATLASSIAN_COM("Atlassian.com"),

    FEATURES("Features"),
    RESOURCES("Resources"),
    TEMPLATES("Templates"),
    PRICING("Pricing"),
    ENTERPRISE("Enterprise");

    private String value;

    public String getValue() {
        return value;
    }
}
