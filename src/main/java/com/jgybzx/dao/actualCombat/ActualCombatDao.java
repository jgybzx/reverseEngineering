package com.jgybzx.dao.actualCombat;

import com.jgybzx.domain.actualCombat.ActualCombat;
import com.jgybzx.domain.actualCombat.ActualCombatExample;
import java.util.List;

public interface ActualCombatDao {

    int deleteByPrimaryKey(String packingListId);


    int insert(ActualCombat record);


    int insertSelective(ActualCombat record);

    List<ActualCombat> selectByExample(ActualCombatExample example);

    ActualCombat selectByPrimaryKey(String packingListId);

    int updateByPrimaryKeySelective(ActualCombat record);

    int updateByPrimaryKey(ActualCombat record);
}