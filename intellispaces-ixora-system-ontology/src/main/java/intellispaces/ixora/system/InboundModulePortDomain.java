package intellispaces.ixora.system;

import intellispaces.framework.core.annotation.Channel;
import intellispaces.framework.core.annotation.Domain;

/**
 * Inbound module port.
 */
@Domain("b923e0b3-58fc-4bff-be34-8555049604dd")
public interface InboundModulePortDomain extends ModulePortDomain {

  @Channel("e7d5352b-cc31-47b8-ad05-7c472ea0d9dd")
  ModulePortDomain asModulePort();
}
