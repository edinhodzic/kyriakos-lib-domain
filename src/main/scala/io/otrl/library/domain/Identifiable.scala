package io.otrl.library.domain

import scala.beans.BeanProperty

trait Identifiable {
  @BeanProperty var id: String = _
}
