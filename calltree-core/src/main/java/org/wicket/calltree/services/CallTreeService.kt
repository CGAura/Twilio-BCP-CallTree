package org.wicket.calltree.services

import org.wicket.calltree.dto.Response
import org.wicket.calltree.model.BcpStartRequest

/**
 * @author Alessandro Arosio - 11/04/2020 13:16
 */
interface CallTreeService {
  fun initiateCalls(bcpStartRequest: BcpStartRequest) : List<Response>
}