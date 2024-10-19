package intellispaces.ixora.system;

import intellispaces.framework.core.annotation.Channel;
import intellispaces.framework.core.annotation.Domain;

/**
 * Outbound module port.
 */
@Domain("002efd3a-d5ec-4fd0-954a-07cd93e45786")
public interface OutboundModulePortDomain extends ModulePortDomain {

  @Channel("b044f77f-5a71-4c03-a316-b6928e35fa0d")
  ModulePortDomain asModulePort();
}
