# WebCrawler
Request based Deep web-crawling application

Create web crawler that takes URL and depth as parameter and create a tree of child pages linked to the URL. application is expected to provide deep-crawling solution, that it goes through multiple levels in link hierarchy. Create a simple API endpoint that would take URL as a parameter and return JSON representing the below format. 

total_links – total Links crawled.
total_images – total images crawled.
details – information about each link crawled.
 
Response should be in json format:
{
                "total_links": "",
                "total_images": "",
                "details": [{
                                                "page_title": "",
                                                "page_link": "",
                                                "image_count": ""
                                },
                                {
                                                "page_title": "",
                                                "page_link": "",
                                                "image_count": ""
                                }
                ]
}

Api endpoint : /api/extractUrl?url=https:/www.geeksforgeeks.org&depth=2

