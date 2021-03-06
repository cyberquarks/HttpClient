/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.cyberquarks.http.request;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class HttpRequest {
  protected static Set<Header> EmptyHeaders = new HashSet<Header>();
  protected static Map<String, String> EmptyParams = new HashMap<>();

  private URL url;
  private Set<Header> headers;
  private Map<String, String> queryParameters;

  public HttpRequest(String url, Set<Header> headers, Map<String, String> queryParameters) throws MalformedURLException {
    this.url = new URL(url);
    this.headers = headers;
    this.queryParameters = queryParameters;
  }

  public URL getUrl() {
    return url;
  }

  public Set<Header> getHeaders() {
    return headers;
  }

  public Map<String,String> getQueryParameters() {
    return queryParameters;
  }

}

