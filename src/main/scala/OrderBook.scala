package me.majidin.shpp

import me.majidin.shpp.models._

object OrderBook {
  object Commands {
    sealed trait Command
    case class AddLimitOrder(o: LimitOrder) extends Command
    case class CancelOrder(id: OrderId) extends Command
  }

  object Events {
    sealed trait Event
    case class OrderExecuted(buy: Execution, sell: Execution) extends Event
   
    case object LimitOrderAdded extends Event
    case object OrderCancelRejected extends Event
    case object OrderCanceled extends Event
  }
}
