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
import java.util.Map;
import java.util.Set;
import org.cyberquarks.http.HttpBody;

public class PostRequest extends HttpRequestWithBody {

  public PostRequest(String url, Set<Header> headers, Map<String, String> queryParameters,
      HttpBody body)
      throws MalformedURLException {
    super(url, headers, queryParameters, body);
  }

  public PostRequest(String url, Set<Header> headers, HttpBody body) throws MalformedURLException {
    super(url, headers, EmptyParams, body);
  }

  public PostRequest(String url, HttpBody body) throws MalformedURLException {
    super(url, EmptyHeaders, EmptyParams, body);
  }
}
