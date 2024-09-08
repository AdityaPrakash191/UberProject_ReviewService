# Cookies

1. Thses are mainly concerned towards privacy.
2. HTTP is stateless protocol & a lot of time user session is required.

# how cookies works?

1. cookies are unique identifier string, they are set by the server through http headers.
2. as soon as a cookie is stored, it is sent along with subsequent http response to the same server.
3. this allows server to know who is contacting it and hence serve the content accordingly.

`set-cookie header` : when a server wants to set a cookie it includes.
"set-cookie " : value in the http response.

                        this value is stored in the cookie file of browser.
