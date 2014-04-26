/*
 * Copyright IBM Corp. 2014
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.bluemix.todos;

import org.springframework.data.annotation.Id;

/**
 * @author <a href="mailto:dev@shindig.apache.org">Shindig Dev</a>
 * @version $Id: $
 */
public class ToDo {
  @Id
  private String id;
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public int getOrder() {
    return order;
  }
  public void setOrder(int order) {
    this.order = order;
  }
  public boolean isCompleted() {
    return completed;
  }
  public void setCompleted(boolean completed) {
    this.completed = completed;
  }
  public String getId() {
    return id;
  }
  private String title;
  private int order;
  private boolean completed;
}

