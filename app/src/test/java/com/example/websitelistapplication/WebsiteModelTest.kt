package com.example.websitelistapplication

import org.junit.Test
import org.junit.Assert.assertEquals

class WebsiteModelTest {
    @Test
    fun testWebsiteDataClass() {
        val website = Website(
            name = "Google",
            url = "https://www.google.com",
            icon = "icon_url",
            description = "Search engine"
        )
        assertEquals("Google", website.name)
        assertEquals("https://www.google.com", website.url)
    }
}