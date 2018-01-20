package com.example.demo.controller;

import java.net.URISyntaxException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version "\$Id$" kenan
 */
@RestController
@RequestMapping("/api/get")
public class SiteMorseSciController {


    @GetMapping(value = "/test", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public String test() throws URISyntaxException {
        return "{\n" +
                "    \"result\": {\n" +
                "        \"finishcode\": \"max_pages\",\n" +
                "        \"links\": 278,\n" +
                "        \"pages\": 1,\n" +
                "        \"finished\": \"2018-01-19T09:54:25\",\n" +
                "        \"scores\": {\n" +
                "            \"function\": {\n" +
                "                \"score\": 0,\n" +
                "                \"title\": \"Function\"\n" +
                "            },\n" +
                "            \"codequality\": {\n" +
                "                \"score\": 7,\n" +
                "                \"title\": \"Code Quality\"\n" +
                "            },\n" +
                "            \"brand\": {\n" +
                "                \"score\": null,\n" +
                "                \"title\": \"Brand\"\n" +
                "            },\n" +
                "            \"overall\": {\n" +
                "                \"exactscore\": 3.8600000000000003,\n" +
                "                \"score\": 4,\n" +
                "                \"title\": \"Overall\"\n" +
                "            },\n" +
                "            \"accessibility\": {\n" +
                "                \"score\": 0,\n" +
                "                \"title\": \"Accessibility\"\n" +
                "            },\n" +
                "            \"pdf\": {\n" +
                "                \"score\": null,\n" +
                "                \"title\": \"PDF\"\n" +
                "            },\n" +
                "            \"performance\": {\n" +
                "                \"score\": 10,\n" +
                "                \"title\": \"Performance\"\n" +
                "            },\n" +
                "            \"spelling\": {\n" +
                "                \"score\": null,\n" +
                "                \"title\": \"Spelling\"\n" +
                "            },\n" +
                "            \"email\": {\n" +
                "                \"score\": null,\n" +
                "                \"title\": \"Email\"\n" +
                "            },\n" +
                "            \"metadata\": {\n" +
                "                \"score\": 10,\n" +
                "                \"title\": \"Metadata\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"ID\": 1467165484,\n" +
                "        \"url\": \"https://secure.sitemorse.com/reportkey.html?id=1467165484&sci&key=5c11b465&url=http%3A%2F%2Fwww.onehippo.org%2Flibrary%2Fabout%2Funderstand-hippo.html\",\n" +
                "        \"priorities\": {\n" +
                "            \"seo\": {\n" +
                "                \"diagnostics\": [],\n" +
                "                \"total\": 0,\n" +
                "                \"title\": \"Search engine optimization\"\n" +
                "            },\n" +
                "            \"grc\": {\n" +
                "                \"diagnostics\": [\n" +
                "                    {\n" +
                "                        \"category\": \"Accessibility\",\n" +
                "                        \"total\": 1,\n" +
                "                        \"title\": \"WCAG 2: H44 - Using label elements to associate text labels with form controls\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"total\": 1,\n" +
                "                \"title\": \"Governance, risk and compliance\"\n" +
                "            },\n" +
                "            \"ux\": {\n" +
                "                \"diagnostics\": [\n" +
                "                    {\n" +
                "                        \"category\": \"Broken link\",\n" +
                "                        \"total\": 3,\n" +
                "                        \"title\": \"File not found\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"total\": 1,\n" +
                "                \"title\": \"User experience\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"totals\": {\n" +
                "            \"function\": 3,\n" +
                "            \"email\": 0,\n" +
                "            \"performance\": 0,\n" +
                "            \"seo\": 0,\n" +
                "            \"codequality\": 6,\n" +
                "            \"brand\": 0,\n" +
                "            \"quality\": 3,\n" +
                "            \"wcag2\": 10,\n" +
                "            \"spelling\": 0\n" +
                "        },\n" +
                "        \"urls\": 178,\n" +
                "        \"telnumbers\": {}\n" +
                "    }\n" +
                "}";
    }


}


