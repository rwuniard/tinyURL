# tinyURL
A utility to generate a tiny URL. This utility only create a tiny URL and reverse the tiny URL to a unique identifier.

This is an overview how the tinyURL will work.
In the main program, the tiny URL is generated from 12345 number, which will be auto-generated in the whole tiny URL system.
The id will be associated with the actual URL that will be mapped to the tiny URL.
For example: 12345 -> http://yourdomain.net/link1/link2
The result will be appended to the URL such as http://yourdomain.net/AbRHY and will be sent back to the requester.
The requester will put the tiny URL into their page and when the user click the tiny URL, it will make a request back to yourdomain.net
and pass in the AbRHY. It will reverse the AbRHY back to 12345 and look up the 12345 to get the actual URL.
Then it will redirect it to the actual URL, in this case the http://yourdomain.net/link1/link2
