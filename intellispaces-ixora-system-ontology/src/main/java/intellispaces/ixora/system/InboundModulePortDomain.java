package intellispaces.ixora.system;

import intellispaces.framework.core.annotation.Channel;
import intellispaces.framework.core.annotation.Domain;

/**
 * Inbound module port.
 */
@Domain("b923e0b3-58fc-4bff-be34-8555049604dd")
public interface InboundModulePortDomain {

  @Channel("ead777d3-38b0-46c3-9da1-a9ea3cb3b9f7")
  ModuleDomain module();
}
